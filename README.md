# 🎱 Magic8Ballrrr

**Magic8Ballrrr** tells you your future!

[![](https://jitpack.io/v/techygrrrl/Magic8Ballrrr.svg)](https://jitpack.io/#techygrrrl/Magic8Ballrrr)

- [Features](#features)
- [Installation \& Usage](#installation--usage)
  - [Installation](#installation)
  - [Usage](#usage)


## Features

- Answer positively, negatively, or with a neutral answer
- Has a default list of answers for quick implementation
- Answers can be customized! Assign your own text and emojis to your answers
- `Answer#format()` formats the answer text with a preceding emoji
- Shuffles your answers a lot and chooses a random one using `java.security.SecureRandom`


## Installation & Usage

### Installation

[![](https://jitpack.io/v/techygrrrl/Magic8Ballrrr.svg)](https://jitpack.io/#techygrrrl/Magic8Ballrrr)

This library can be added as a project dependency via Jitpack. The version below will be hardcoded, but use the latest version on Jitpack. You can click the version image above or see the snippets below.

Add to your root `build.gradle` file:

```groovy
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
  }
}
```

Add to your dependencies in your project `build.gradle` file:

```groovy
dependencies {
  implementation 'com.github.techygrrrl:Magic8Ballrrr:0.1.1'
}
```

To learn more about Jitpack, see their [docs](https://docs.jitpack.io/intro/).


### Usage

- [Example in unit tests](https://github.com/techygrrrl/Magic8Ballrrr/blob/main/lib/src/test/kotlin/techygrrrl/magic8ballrrr/Magic8BallrrrTest.kt)
- [KDoc class docs](https://techygrrrl.github.io/Magic8Ballrrr/-magic8-ballrrr/techygrrrl.magic8ballrrr)
