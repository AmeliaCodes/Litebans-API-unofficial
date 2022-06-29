# Litebans-API-unofficial
 
## About
This is an unofficial API for Litebans, which I decided to create because I wanted an easier way to interact with Litebans. The orginial is alright, but this will help a lot of people by creating better methods.

## Implementation
At the current time, this API is only accessible through Jitpack and Maven. We may consider Gradle/JAR implementation in the future.

### Repository
(insert maven repo here)

### Dependency
(insert maven dependency here)

## Usage
To begin using the API, you must first implement it into your project using maven. Once this is done, you will gain access to the API in your project. To access the API, create an instance of the LitebansAPI class. To do so, you must pass in the Database object from the original Litebans API.
```
LitebansAPI api = new LitebansAPI(Database.get());
```java
The `LitebansAPI` object holds all of the classes like HistoryManager or BanManager.
### Getting a player's history
To fetch a player's history, you can use the `getHistory` method.
```java
HistoryManager historyManager = api.getHistoryManager();
List<Punishment> punishments = historyManager.getBans("PlayerName");
```
