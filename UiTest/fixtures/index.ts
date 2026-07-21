import { flightFlow } from "../flow/SearchFlow";
import { Evidence } from "../src/util/Evidence";
import { test as base } from "./LoggerFixture";

type Fixtures = {
  evidence: Evidence;
  searchFlow: flightFlow;
};

export const test = base.extend<Fixtures>({
  evidence: async ({ page }, use, testInfo) => {
    await use(new Evidence(page, testInfo));
  },

  searchFlow: async ({ page, evidence }, use) => {
    await use(new flightFlow(page, evidence));
  },
});

export { expect } from "@playwright/test";