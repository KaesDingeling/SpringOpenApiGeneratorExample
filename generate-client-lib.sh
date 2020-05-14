java -jar ~/Downlaods/openapi-generator-cli.jar generate \
  -i http://localhost:8080/api/v3/api-docs \
  --api-package de.kaesdingeling.spring.openapi.generator.example.generated.api \
  --model-package de.kaesdingeling.spring.openapi.generator.example.generated.model \
  --invoker-package de.kaesdingeling.spring.openapi.generator.example.generated.invoker \
  --group-id de.kaesdingeling.spring.openapi.generator.example.generated \
  --artifact-id GeneratedRESTApiClient \
  --artifact-version 1.0 \
  --library webclient \
  --generator-name java \
  -o GeneratedRESTApiClient
