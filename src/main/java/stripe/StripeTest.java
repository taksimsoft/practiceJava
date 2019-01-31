package stripe;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Card;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentIntentSourceActionValueAuthorizeWithUrl;
import com.stripe.model.Source;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class StripeTest {

    public static final String E_MAIL = "servet.karabas@gmail.com";
    private static Card card = new Card();

  @BeforeAll
  public static void initalize() {
    Stripe.apiKey = "sk_test_WR33tyLl4FnDE6G4Pni3zbAt"; // servet.karabas
    System.out.println("https://dashboard.stripe.com/test/payments");
  }

  @Test
  public void sourceAndPaymentIntentTest() throws StripeException {
    Map<String, Object> sourceParams = new HashMap<String, Object>();
    sourceParams.put("type", "card");
    Map<String, Object> address = new HashMap<String, Object>();
    address.put("country", "DE");
    Map<String, Object> ownerParams = new HashMap<String, Object>();
    Map<String, Object> card = new HashMap<String, Object>();
    card.put("exp_month", 4);
    card.put("exp_year", 2024);
    card.put("number", "4242424242424242");
    sourceParams.put("owner", ownerParams);
    sourceParams.put("card", card);
    Source source = Source.create(sourceParams);
    System.out.println("SOURCE :" + source.getStatus());

    Map<String, Object> paymentintentParams = new HashMap<String, Object>();
    paymentintentParams.put("amount", 1099);
    paymentintentParams.put("currency", "eur");
    paymentintentParams.put("description", "Payment Test without 3D");
    ArrayList allowed_source_types = new ArrayList();
    allowed_source_types.add("card");
    paymentintentParams.put("source", source.getId());
    paymentintentParams.put("allowed_source_types", allowed_source_types);
    PaymentIntent paymentIntent = PaymentIntent.create(paymentintentParams);
    System.out.println("PAYMENT INTENT : " + paymentIntent.getStatus());

    Map<String, Object> confirmPaymentParams = new HashMap<String, Object>();
    confirmPaymentParams.put("return_url", "https://strictest.free.beeceptor.com");
    paymentIntent.setStatementDescriptor("Payment Request Test Without 3D");
    PaymentIntent confirm = paymentIntent.confirm(confirmPaymentParams);

//    Assertions.assertThat(source).isNotNull();
//    assertThat(paymentIntent).isNotNull();
//    assertThat(confirm).isNotNull();
  }

  @Test
  public void sourceAndPaymentIntentAndConfirmWith3DSTest() throws StripeException {

    Map<String, Object> sourceParams = new HashMap<String, Object>();
    sourceParams.put("type", "card");
    Map<String, Object> address = new HashMap<String, Object>();
    address.put("country", "DE");
    Map<String, Object> ownerParams = new HashMap<String, Object>();
    ownerParams.put("email", E_MAIL);
    Map<String, Object> card = new HashMap<String, Object>();
    card.put("exp_month", 4);
    card.put("exp_year", 2024);
    card.put("number", "4000000000003063");
    sourceParams.put("owner", ownerParams);
    sourceParams.put("card", card);
    Source source = Source.create(sourceParams);
    source.setStatementDescriptor("s");
    System.out.println("SOURCE(3D) Id Status :" + source.getId() + " " + source.getStatus());

    Map<String, Object> paymentintentParams = new HashMap<String, Object>();
    paymentintentParams.put("amount", 2000);
    paymentintentParams.put("currency", "eur");
    paymentintentParams.put("description", " Payment Test with * 3D *");
    paymentintentParams.put("source", source.getId());
    ArrayList allowed_source_types = new ArrayList();
    allowed_source_types.add("card");
    paymentintentParams.put("allowed_source_types", allowed_source_types);
    PaymentIntent paymentIntent = PaymentIntent.create(paymentintentParams);
    paymentIntent.setStatementDescriptor("3D");
    System.out.println(
        "PAY INTENT Id Status (3D): "
            + paymentIntent.getId()
            + " "
            + paymentIntent.getStatus());

    Map<String, Object> confirmPaymentParams = new HashMap<String, Object>();
    confirmPaymentParams.put("return_url", "https://strictest.free.beeceptor.com");
      paymentIntent.setStatementDescriptor("Payment Request Test Without 3D");
      PaymentIntent confirm = paymentIntent.confirm(confirmPaymentParams);

    PaymentIntentSourceActionValueAuthorizeWithUrl authorizeWithUrl =
        confirm.getNextSourceAction().getAuthorizeWithUrl();

    System.out.println(
        "PAYMENT CONFIRM Id Status (3D):" + confirm.getId() + " " + confirm.getStatus());

    System.out.println(
        "Please Authorize the URL to complete process (3D):" + authorizeWithUrl.getUrl());

//    assertThat(source).isNotNull();
//    assertThat(paymentIntent).isNotNull();
//    assertThat(confirm).isNotNull();
  }
}
