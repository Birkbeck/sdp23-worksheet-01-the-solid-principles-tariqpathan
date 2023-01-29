public class Greeter {
    String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

class FormalGreet implements Greeting {
    @Override
    public String greet() {
        return "Good evening";
    }
}

class CasualGreet implements Greeting {
    @Override
    public String greet() {
        return "Goodday?";
    }
}

class IntimateGreet implements Greeting {
    @Override
    public String greet() {
        return "Hello darling!";
    }
}

class BasicGreet implements Greeting {
    @Override
    public String greet() {
        return "Hello";
    }
}
