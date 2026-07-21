import { Locator, Page } from "@playwright/test";

export class xpLocators {
    private constructor() {}
    
     static SELECTDATE(page:Page):Locator{
     return  page.locator("#home-date");  
    }
}