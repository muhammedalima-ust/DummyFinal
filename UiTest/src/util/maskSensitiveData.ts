const SENSITIVE_DATA = "SENSITIVEDATA";

const sensitiveKeys = [
  "password",
  "token",
  "secret",
  "apikey",
  "api_key",
  "authorization",
];

export function maskSensitiveData(data: unknown): unknown {
  if (!data || typeof data !== "object") {
    return data;
  }

  if (Array.isArray(data)) {
    return data.map(maskSensitiveData);
  }

  return Object.fromEntries(
    Object.entries(data).map(([key, value]) => {
      const isSensitive = sensitiveKeys.includes(key.toLowerCase());

      return [
        key,
        isSensitive ? SENSITIVE_DATA : maskSensitiveData(value),
      ];
    })
  );
}