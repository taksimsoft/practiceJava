package builderPatternwithFunction;

public class BuilderPatternMain {

  public static void main(String[] args) {
      Person person = new PersonBuilder()
              .with($ -> {
                  $.salutation = "Mr.";
                  $.firstName = "John";
                  $.lastName = "Doe";
                  $.isFemale = false;
                  $.isHomewOwner = true;
                  $.address =
                          new PersonBuilder().addressBuilder().with($_address -> {$_address.city = "";}).createAddress();
              })
              .createPerson();

    System.out.println(person);
  }
}
