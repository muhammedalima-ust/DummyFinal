import fs from "fs";

export function saveLogs(
  testName: string,
  logs: string[]
) {
  fs.mkdirSync("logs", { recursive: true });

  const fileName =
    testName.replace(/\s+/g, "_") + "-log.txt";

  fs.writeFileSync(
    `logs/${fileName}`,
    logs.join("\n")
  );
}