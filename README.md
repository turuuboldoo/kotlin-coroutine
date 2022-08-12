# Kotlin Coroutine in Spring

## Kotlin Coroutine

Kotlin Coroutines are Kotlin lightweight threads allowing to write non-blocking code in an imperative way. On language
side, suspending functions provides an abstraction for asynchronous operations while on library side kotlinx.coroutines
provides functions like async { } and types like Flow.

Read more about Kotlin coroutine in Spring
\
[Coroutines guide](https://kotlinlang.org/docs/coroutines-guide.html)
\
[What is the difference between launch/join and async/await in Kotlin coroutines](https://stackoverflow.com/questions/46226518/what-is-the-difference-between-launch-join-and-async-await-in-kotlin-coroutines)
\
[Kotlinx coroutines core](https://github.com/Kotlin/kotlinx.coroutines/tree/master/kotlinx-coroutines-core)
\
[Core kotlin concurrency](https://github.com/turuuboldoo/core-kotlin-modules/tree/main/core-kotlin-concurrency)
\
[Reactive or Coroutines](https://medium.com/digitalfrontiers/reactive-or-coroutines-between-a-rock-and-a-hard-place-6a41a151195a)
\
[Making Webflux code readable with Kotlin coroutines](https://blog.allegro.tech/2020/02/webflux-and-coroutines.html)

## Start database

### Windows 11 setup

\
[WSL2](https://docs.microsoft.com/en-us/windows/wsl/install)
\
[Docker Desktop on Windows 11](https://docs.docker.com/desktop/install/windows-install/)

### Ubuntu setup

Set up Docker’s package repository.

```
sudo apt-get update
sudo apt-get install \
    ca-certificates \
    curl \
    gnupg \
    lsb-release
```

Add Docker’s official GPG key

```
sudo mkdir -p /etc/apt/keyrings
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg
```

Use the following command to set up the repository

```
echo \
  "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \
  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```

[Download Docker Desktop from here](https://docs.docker.com/desktop/install/linux-install/) and install

```
sudo apt-get update
sudo apt-get install ./docker-desktop-<version>-<arch>.deb
```

Start PostgreSQL database from Docker

```
docker-compose up -d --build
```

Next run application from IntelliJ Idea

Good Luck!!!
