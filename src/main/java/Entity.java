public class Entity {

    @Secured(one = 1)
    public void publicMethodFirst() {
    }

    @Secured(one = 2, two = "two")
    private void privateMethodFirst() {
    }

    private void privateMethodSecond(String stringParameter1) {
    }

    protected void protectedMethodFirst() {
    }
}
