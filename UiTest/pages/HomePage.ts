import { Page } from "@playwright/test";


export class HomePage {
    constructor(private readonly page:Page) {}

    async goto(){
        await this.page.goto("/login");
    }
    
    async login(email:string,password:string){
        await this.page.getByLabel('email').fill(email);
        await this.page.getByLabel('password').fill(password);
        await this.page.getByRole('button',{name:'Sign in'}).click();
    }
}