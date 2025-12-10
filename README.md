[![Build Status](https://v3.travis-ci.com/DRAutomation/dra-java-sdk.svg?token=Z799xXryYYPor3yyJxEs&branch=main)](https://v3.travis-ci.com/DRAutomation/dra-java-sdk)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# IBM Cloud DrAutomation java SDK Version 0.0.1
Java client library to interact with various [IBM Cloud DrAutomation services](https://cloud.ibm.com/docs/dr-automation-powervs).

Disclaimer: this SDK is being released initially as a **pre-release** version.
Changes might occur which impact applications that use this SDK.

## Table of Contents

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc --maxdepth 4 -i README.md
  -->

<!-- toc -->

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
  * [Maven](#maven)
  * [Gradle](#gradle)
- [Using the SDK](#using-the-sdk)
  * [Environment Configuration](#environment-configuration)
- [Questions](#questions)
- [Issues](#issues)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud DrAutomation services Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Coordinates
--- | ---
[DrAutomation Service](https://cloud.ibm.com/apidocs/dr-automation-powervs) | com.ibm.cloud:drautomation-sdk:0.0.1
<!-- [Example Service](https://cloud.ibm.com/apidocs/example-service) | com.ibm.cloud:example-service:0.0.1 -->

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create one [here](https://cloud.ibm.com/iam/apikeys).
* Java 8 or above.

## Installation
The current version of this SDK is: 0.0.1

Each service's artifact coordinates are listed in the table above.

The project artifacts are published on the public [Maven Central](https://repo1.maven.org/maven2/)
artifact repository.  This is the default public repository used by maven when searching for dependencies.
To use this repository within a gradle build, please see
[this link](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use a particular service, define a dependency that contains the
artifact coordinates (group id, artifact id and version) for the service.
Here are examples for maven and gradle:

### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>dr-automation-service</artifactId>
    <version>0.0.1</version>
</dependency>
```

### Gradle
```gradle
compile 'com.ibm.cloud:dr-automation-service:0.0.1'
```

## Using the SDK
For general SDK usage information, please see [this link](https://github.com/IBM/ibm-cloud-sdk-common/blob/main/README.md)

### Environment Configuration

The SDK can be configured using environment variables. Here's an example configuration:

```bash
# Service URL (for development/testing)
export DR_AUTOMATION_SERVICE_URL=https://power-dra.cloud.ibm.com

# Authentication type
export DR_AUTOMATION_SERVICE_AUTH_TYPE=bearerToken

# Bearer token for authentication
export DR_AUTOMATION_SERVICE_BEARER_TOKEN=eyJraWQiOiIyMDE5MD......
```

**Note:** The bearer token shown above is an example. For production use:
- Use the actual service endpoint URL 
- Generate your own valid IAM bearer token

## Questions

If you are having difficulties using this SDK or have a question about the IBM Cloud services,
please ask a question at
[Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues
If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/dra-java-sdk/issues).
Before that, please search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM
Find more open source projects on the [IBM Github Page](http://ibm.github.io/)

## Contributing
See [CONTRIBUTING](CONTRIBUTING.md).

## License

The IBM Cloud DrAutomation services Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](LICENSE).
