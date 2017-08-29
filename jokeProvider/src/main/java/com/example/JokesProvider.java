package com.example;

public class JokesProvider {
    private static String[] mJokes = {
            "Two fish are sitting in a tank. One looks over at the other and says: \"Hey, do you know how to drive this thing?\"",
            "This is your captain speaking, AND THIS IS YOUR CAPTAIN SHOUTING.",
            "I told my doctor that I broke my arm in two places. He told me to stop going to those places.",
            "What do you call it when Batman skips church? Christian Bale.",
            "What's orange and sounds like a parrot? A carrot.",
            "How do you keep an idiot in suspense?",
            "Two whales walk into a bar. The first one says, \"Weeeeeooooouuuhhhh.\" The next whale says, \"Shut up, Steve. You're drunk.\"",
            "Wanna hear a joke about Potassium? Whether they say 'yes' or 'no': K. ",
            "What's the difference between a golfer and a skydiver? A golfer goes *whack* \"damn\" and a skydiver goes \"damn\" *whack*.",
            "I asked my North Korean friend how it was there, he said he couldn't complain.",
            "Last night me and my girlfriend watched three DVDs back to back. Luckily I was the one facing the telly.",
            "They all laughed when I said I wanted to be a comedian. Well, they're not laughing now.",
            "I used to be addicted to soap, but I'm clean now.",
            "I was wondering, why does a frisbee appear larger the closer it gets... then it hit me.",
            "I used to think the brain was the most important organ. Then I thought, look what's telling me that.",
            "A magician was walking down the street and turned into a grocery store.",
            "What kind of shoes do ninjas wear? Sneakers.",
            "Why can't a bike stand on its own? It's two tired.",
            "What do you call a big pile of kittens? A meowntain.",
            "What do you call a dinosaur with a extensive vocabulary? A thesaurus."
    };

    public static String getJoke() {
        return mJokes[(int) (Math.random() * mJokes.length)];
    }
}
