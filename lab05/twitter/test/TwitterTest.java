import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

class TwitterTest {

    @Test
    void actual_call() {

        Twitter twitter = new Twitter();

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);
    }

    @Test
    void mock_full_object() {

        Twitter twitter = createMock("twitter", Twitter.class);

        expect(twitter.loadTweet()).andReturn("hello @me");
        expect(twitter.loadTweet()).andReturn("hello @you");
        replay(twitter);

        String actual;

        actual = twitter.loadTweet();
        assertEquals("hello @me", actual);

        actual = twitter.loadTweet();
        assertEquals("hello @you", actual);
    }

    @Test
    void mock_partial_object() {

        Twitter twitter = partialMockBuilder(Twitter.class)
          .addMockedMethod("loadTweet")
          .createMock();

        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);

        actual = twitter.isMentionned("you");
        assertEquals(false, actual);
    }

    @Test
    void isMentionned_lookForAtSymbol() {
    expect(twitter.loadTweet()).andReturn("hello @me").times(2);
    replay(twitter);

    boolean var1 = twitter.isMentionned("me"); 
    boolean var2 = twitter.isMentionned("you"); 

    assertEquals(true, var1);
    assertEquals(false, var2);
    }

    @Test
    void isMentionned_dontReturnSubstringMatches() {
    expect(twitter.loadTweet()).andReturn("hello @meat").times(2);
    replay(twitter);

    boolean var3 = twitter.isMentionned("me");
    boolean var4 = twitter.isMentionned("meat");

    assertEquals(false, var3);
    assertEquals(true, var4);
    }

    @Test
    void isMentionned_superStringNotFound() {
    expect(twitter.loadTweet()).andReturn("hello @me").times(2);
    replay(twitter);

    boolean var5 = twitter.isMentionned("me");
    boolean var6 = twitter.isMentionned("meat");

    assertEquals(true, var5);
    assertEquals(false, var6);
    }

    @Test
    void isMentionned_handleNull() {
    expect(twitter.loadTweet()).andReturn("null").times(2);
    replay(twitter);   

    boolean var7 = twitter.twitterisMentionned("me");
    boolean var8 = twitter.isMentionned("meat");
   
    assertEquals(false, var7);
    assertEquals(false, var8);
    }
}