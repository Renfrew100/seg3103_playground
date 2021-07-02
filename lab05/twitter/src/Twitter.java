public class Twitter {

  public String loadTweet()
  {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}

    double r =  Math.random();
    if (r <= 0.45) {
      return "I am tweet that likes to talk about @me";
    } else if (r <= 0.9) {
      return "Hello to @you";
    } else {
      return null;
    }
  }

  //fix is mentionned test case
  public boolean isMentionned(String name) {
    String tweet = loadTweet();
    return tweet.contains("@" + name);
  }

    void isMentionned_lookForAtSymbol() {
     //Assuming a tweet like "hello @me"
     isMentionned("me");
     isMentionned("you");
    }

     void isMentionned_dontReturnSubstringMatches() {
     // Assuming a tweet like "hello @meat"
      isMentionned("me");
      isMentionned("meat");
    } 

    void isMentionned_superStringNotFound() {
     // Assuming a tweet like "hello @me"
     isMentionned("me"); //should be true
     isMentionned("meat"); //should be false
    }

    void isMentionned_handleNull() {
    // Assuming no tweet is available (i.e. null)
     isMentionned("me"); //should be false
     isMentionned("meat"); //should be false
    }
}