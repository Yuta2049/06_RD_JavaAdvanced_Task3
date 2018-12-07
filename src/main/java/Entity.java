public class Entity {

    @Secured(one=1)
    public void publicMethod() {

    }

    @Secured(one=2, two = "two")
    private void privateMethod() {

    }

    protected void protectedMethod() {

    }
}
