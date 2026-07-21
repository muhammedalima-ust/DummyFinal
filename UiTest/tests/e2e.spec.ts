import { add } from "winston";
import { expect, test } from "../fixtures/index";
import { util } from "../src/util/utils";
import { secrets } from "../config/secrets";
import { testUsers } from "../TestData/testUser";

test.describe("Book and Cancel teh flight",()=>{
    test("Booking a flight from DEL to JAI",async ({searchFlow,log})=>{


        const email = util.emailName(`${testUsers.user.name}`);
        const password = secrets.get(`${testUsers.user.name}_PASSWORD`);

        await searchFlow.openWebsite(email,password);
        log.info("The User Logined",{
        username:email,
        password:password
        });
        
    })
})