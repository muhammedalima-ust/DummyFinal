import { Page } from "@playwright/test";
import { HomePage } from "../pages/HomePage";
import { Evidence } from "../src/util/Evidence";

export class flightFlow {
    private readonly homePage:HomePage;
    constructor(private readonly page:Page,private readonly evidence:Evidence) {
         /**
        * Every Page is intialised 
        */
        this.homePage = new HomePage(page);

    }


     /**
    * This Method will navigate to website
    */
   async openWebsite(email:string,password:string){
    await this.homePage.goto();
    await this.homePage.login(email,password);

    this.evidence.evidenceText('UserData',{
        email:email,
        password:password
    })

    this.evidence.evidenceImage('Login Image')
   }

}