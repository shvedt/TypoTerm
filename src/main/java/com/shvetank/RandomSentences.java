package com.shvetank;

import java.util.Random;

class RandomSentencesFromWords {
     static String[] randomWords = {
                "apple", "banana", "cherry", "date", "elephant", "falcon", "grape", "honey", "igloo", "jacket",
                "kangaroo", "lemon", "mountain", "nectar", "ocean", "piano", "quartz", "rainbow", "sunflower",
                "tiger", "umbrella", "violet", "whale", "xylophone", "yogurt", "zebra", "albatross", "beetle",
                "cactus", "diamond", "eagle", "fountain", "gorilla", "horizon", "island", "jungle", "koala",
                "lantern", "mango", "night", "octopus", "pyramid", "quiver", "river", "strawberry", "thunder",
                "universe", "volcano", "wizard", "xenon", "yacht", "zeppelin", "avocado", "breeze", "canyon",
                "desert", "emerald", "forest", "glacier", "harbor", "iceberg", "jigsaw", "kettle", "lighthouse",
                "meadow", "nebula", "orchid", "peacock", "quicksand", "reef", "sapphire", "tornado", "uranium",
                "vineyard", "waterfall", "xerox", "yew", "zephyr", "aluminum", "bison", "coral", "dolphin",
                "echo", "frost", "geyser", "hummingbird", "iris", "jellyfish", "lily", "meteor", "nocturne",
                "ostrich", "platinum", "quokka", "redwood", "serenade", "temple", "ultraviolet", "wolverine",
                "yarn", "apricot", "birch", "crystal", "drizzle", "evergreen", "flamingo", "gull", "heron",
                "icicle", "jasmine", "lavender", "mist", "obsidian", "petal", "rose", "seaweed", "tide", "umbra",
                "whisper", "yucca", "ash", "bamboo", "clover", "dew", "elm", "fern", "hibiscus", "juniper",
                "kiwi", "lilac", "maple", "nectarine", "oak", "pebble", "quince", "reed", "sunrise", "tulip",
                "willow", "zinnia", "arctic", "dune", "eclipse", "fawn", "glade", "jasper", "kelp", "lagoon",
                "oasis", "palm", "quarry", "rain", "savanna", "thistle", "valley", "wilderness", "amber",
                "boulder", "cove", "dusk", "grove", "ivy", "jade", "knoll", "lichen", "moon", "noon", "prairie",
                "quasar", "star", "twilight", "undergrowth", "vista", "arch", "bramble", "delta", "ember",
                "gorge", "hill", "ice", "lake", "nova", "olive", "pine", "quail", "ridge", "snowflake",
                "upland", "wind", "aspen", "cliff", "field", "garden", "newt", "sea", "zenith", "almond",
                "beach", "citrus", "dawn", "harvest", "inlet", "lotus", "nutmeg", "thunder", "vine", "ash",
                "fir", "harvest", "ice", "maple", "reed", "summit", "elm", "garden", "kelp", "sunrise", "tide",
                "lagoon", "xenon", "obsidian", "mountain", "redwood", "snowflake", "temple", "violet", "zenith",
                "arch", "beetle", "breeze", "dusk", "eclipse", "frost", "hill", "iridium", "juniper", "newt",
                "pebble", "reed", "savanna", "twilight", "upland", "vine", "wildflower", "zinnia", "aluminum",
                "cove", "emerald", "glacier", "harbor", "iceberg", "lotus", "maple", "rose", "twilight", "wool",
                "zebra", "arctic", "breeze", "diamond", "emerald", "glacier", "harbor", "jade", "knoll", "lichen",
                "mist", "nova", "quartz", "seaweed", "umbra", "vineyard", "xylophone", "zephyr", "amber", "cedar",
                "ember", "fir", "grove", "iceberg", "jungle", "lichen", "mist", "quasar", "rose", "thistle",
                "upland", "willow", "yew", "zenith"
    };

    public static String generateSentence (int sentenceLength) {
        StringBuilder tempSentence = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < sentenceLength; i++) {
            String word = randomWords[random.nextInt(randomWords.length)];
            tempSentence.append(word);

            if (i < sentenceLength - 1) tempSentence.append(" ");
            else tempSentence.append(".");
        }

        return tempSentence.substring(0, 1).toUpperCase() + tempSentence.substring(1);
    }
}
