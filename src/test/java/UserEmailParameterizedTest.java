import com.userRegistration.demo.junit5.UserValidation;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

class UserEmailParameterizedTest {

    @RunWith(Parameterized.class)
    public static class EmailParameterisedTest {
        String email;
        boolean expected_result;


        public EmailParameterisedTest(String email, boolean expected_result) {

            this.email = email;
            this.expected_result =expected_result ;

        }
            @Parameters
            public static Collection data() {
                return Arrays.asList(new Object[][]{
                        {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc111@abc.com", true},
                        {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true},
                        {"abc+100@gmail.com", true},

                        {"abc", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                        {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
                        {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au ", false}});
            }

        @Test
        public void givenEmail_WhenObeysCondition_returnAsDesired() {
            UserValidation users = new UserValidation();
            boolean email_result = users.emailValidation1(this.email);
            Assert.assertEquals(this.expected_result, email_result);
        }

    }

}