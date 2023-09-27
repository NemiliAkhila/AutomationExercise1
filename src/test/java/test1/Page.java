package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    public WebElement ClickSignup;
    @FindBy(xpath = "//input[contains(@name, 'name')]")
    public WebElement name;
    @FindBy(xpath = "(//input[contains(@name, 'email')])[2]")
    public WebElement email;
    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement SignupButton;
    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement VerifyTitle;
    @FindBy(xpath = "//input[contains(@name, 'password')]")
    public WebElement Password;
    @FindBy(xpath = "//select[contains(@name, 'days')]")
    public WebElement EnterDate;
    @FindBy(xpath = "//select[contains(@name, 'months')]")
    public WebElement EnterMonth;
    @FindBy(xpath = "//select[contains(@name, 'years')]")
    public WebElement EnterYear;
    @FindBy(xpath = "//input[contains(@name, 'newsletter')]")
    public WebElement FirstCheckbox;
    @FindBy(xpath = "//input[contains(@name, 'optin')]")
    public WebElement SecondCheckbox;
    @FindBy(xpath = "//input[contains(@name, 'first_name')]")
    public WebElement Firstname;
    @FindBy(xpath = "//input[contains(@name, 'last_name')]")
    public WebElement Lastname;
    @FindBy(xpath = "//input[contains(@name, 'company')]")
    public WebElement Companyname;
    @FindBy(xpath = "//input[contains(@name, 'address1')]")
    public WebElement Address1;
    @FindBy(xpath = "//input[contains(@name, 'address2')]")
    public WebElement Address2;
    @FindBy(xpath = "//select[contains(@name, 'country')]")
    public WebElement Country;
    @FindBy(xpath = "//input[contains(@name, 'state')]")
    public WebElement State;
    @FindBy(xpath = "//input[contains(@name, 'city')]")
    public WebElement city;
    @FindBy(xpath = "//input[contains(@name, 'zipcode')]")
    public WebElement zipcode;
    @FindBy(xpath = "//input[contains(@name, 'mobile_number')]")
    public WebElement MobileNumber;
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement Accountcreate;
    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement VerifyAccount;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement ContinueButton;
    @FindBy(xpath = "//b[contains(text(),'')]")
    public WebElement Verifylogin;
    @FindBy(xpath = "//a[contains(@href, 'delete_account')]")
    public WebElement DeleteAccount;
    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    public WebElement Verifydeletebutton;
    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
    public WebElement VerifyLoginAccount;
    @FindBy(xpath = "(//input[contains(@name, 'email')])[1]")
    public WebElement EmailAddress;
    @FindBy(xpath = "//input[contains(@name, 'password')]")
    public WebElement LoginPassword;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement ClickLogin;
    @FindBy(xpath = "//a[contains(text(),' Logged in as ')]")
    public WebElement IncorrectUsername;
    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    public WebElement IncorrectPassword;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    public WebElement ClickLogoutButton;
    @FindBy(xpath = "//p[contains(text(),'Email Address already exist!')]")
    public WebElement VerifypreviousEmail;
    @FindBy(xpath = "//a[contains(text(),'Contact us')]")
    public WebElement ClickonContact;
    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    public WebElement GetInTouch;
    @FindBy(xpath = "//input[contains(@name, 'name')]")
    public WebElement Namehelp;
    @FindBy(xpath = "//input[contains(@name, 'email')]")
    public WebElement EmailHelp;
    @FindBy(xpath = "//input[contains(@name, 'subject')]")
    public WebElement Subjecthelp;
    @FindBy(xpath = "//textarea[contains(@name, 'message')]")
    public WebElement TextAreahelp;
    @FindBy(xpath = "//input[contains(@name, 'submit')]")
    public WebElement SubmitHelp;
    @FindBy(xpath = "(//div[contains(text(),'Success! Your details have been submitted successfully.')])[1]")
    public WebElement SuccessMessage;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    public WebElement ClickOnHomeButton;
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]")
    public WebElement TestCase;
    @FindBy(xpath = "//b[contains(text(),'Test Cases')]")
    public WebElement VerifyTestCase;
    @FindBy(xpath = "//a[contains(text(),'Products')]")
    public WebElement Product;
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement VerifyProduct;
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
    public WebElement ViewProduct;
    @FindBy(xpath = "(//h2[contains(text(),'')])[3]")
    public WebElement ProductName;
    @FindBy(xpath = "//p[contains(text(),'Category')]")
    public WebElement ProductCategory;
    @FindBy(xpath = "//span[contains(text(),'Rs.')]")
    public WebElement ProductPrice;
    @FindBy(xpath = "//p[contains(text(),'Stock')]")
    public WebElement VerifyProductAvailibility;
    @FindBy(xpath = "(//p[contains(text(),'')])[5]")
    public WebElement VerifyProductCondition;
    @FindBy(xpath = "(//p[contains(text(),'')])[6]")
    public WebElement VerifyProductBrand;
    @FindBy(xpath = "//input[contains(@name, 'search')]")
    public WebElement ProductSearch;
    @FindBy(xpath = "//button[contains(@id, 'submit_search')]")
    public WebElement SearchSubmit;
    @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
    public WebElement VerifySearchProduct;
    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    public WebElement VerifySubscription;
    @FindBy(xpath = "//input[contains(@id, 'susbscribe_email')]")
    public WebElement SubscriptionEmail;
    @FindBy(xpath = "//button[contains(@id, 'subscribe')]")
    public WebElement ClickOnSubscribe;
    @FindBy(xpath = "//div[contains(text(),'You have been successfully subscribed!')]")
    public WebElement VerifySuccessfulSubscribe;
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    public WebElement ClickOnCart;
    @FindBy(xpath = "(//div[contains(@class, 'productinfo text-center')])[1]")
    public WebElement HoverOverFirstProduct;
    @FindBy(xpath = "(//div[contains(@class, 'productinfo text-center')])[2]")
    public WebElement HoverOverSecondProduct;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[2]")
    public WebElement ClickOnAddFirstProduct;
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
    public WebElement ClickOnAddSecondProduct;
    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    public WebElement ClickOnContinueShopping;
    @FindBy(xpath = "//u[contains(text(),'View Cart')]")
    public WebElement ClickOnViewCart;
    @FindBy(xpath = "//a[contains(@href, 'product_details/1')]")
    public WebElement VerifyFirstProductInCart;
    @FindBy(xpath = "//a[contains(@href, 'product_details/2')]")
    public WebElement VerifySecondProductInCart;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[1]")
    public WebElement VerifyFirstProductPrice;
    @FindBy(xpath = "(//button[contains(text(),'')])[2]")
    public WebElement VerifyFirstProductQuantity;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[2]")
    public WebElement VerifyFirstProductTotalPrice;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[3]")
    public WebElement VerifySecondProductPrice;
    @FindBy(xpath = "(//button[contains(text(),'')])[3]")
    public WebElement VerifySecondProductQuantity;
    @FindBy(xpath = "(//p[contains(text(),'Rs.')])[4]")
    public WebElement VerifySecondProductTotalPrice;
    @FindBy(xpath = "//div[contains(@class, 'product-information')]")
    public WebElement VerifyHomepageProductDetails;
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    public WebElement HomepageProductQuantity;
    @FindBy(xpath = "//button[contains(@type, 'button')]")
    public WebElement HomepageProductAddToCart;
    @FindBy(xpath = "(//button[contains(text(),'')])[2]")
    public WebElement VerifyHomepageProductQuantity;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[1]")
    public WebElement AddHomepageProduct1ToCart;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[3]")
    public WebElement AddHomepageProduct2ToCart;
    @FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
    public WebElement VerifyCart;
    @FindBy(xpath = "//a[contains(text(),'Proceed To Checkout')]")
    public WebElement ClickOnProceedToCheckout;
    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    public WebElement ClickOnRegLogin;
    @FindBy(xpath = "//h2[contains(text(),'Address Details')]")
    public WebElement VerifyAddressDetails;
    @FindBy(xpath = "//h2[contains(text(),'Review Your Order')]")
    public WebElement VerifyReviewOrder;
    @FindBy(xpath = "//textarea[contains(@name, 'message')]")
    public WebElement CommentText;
    @FindBy(xpath = "//a[contains(text(),'Place Order')]")
    public WebElement ClickOnPlaceOrder;
    @FindBy(xpath = "//input[contains(@name, 'name_on_card')]")
    public WebElement PaymentName;
    @FindBy(xpath = "//input[contains(@name, 'card_number')]")
    public WebElement PaymentCardNo;
    @FindBy(xpath = "//input[contains(@name, 'cvc')]")
    public WebElement PaymentCardCVV;
    @FindBy(xpath = "//input[contains(@name, 'expiry_month')]")
    public WebElement PaymentCardExpiryMonth;
    @FindBy(xpath = "//input[contains(@name, 'expiry_year')]")
    public WebElement PaymentCardExpiryYear;
    @FindBy(xpath = "//button[contains(text(),'Pay and Confirm Order')]")
    public WebElement ClickOnPayAndConfirmOrder;
    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    public WebElement VerifySuccessMessage;
    @FindBy(xpath = "//span[contains(text(),'Close')]")
    public WebElement ClickOnAdvertiseClose;
    @FindBy(xpath = "(//a[contains(@class, 'cart_quantity_delete')])[1]")
    public WebElement RemoveFirstProductFromCart;
    @FindBy(xpath = "(//a[contains(@class, 'cart_quantity_delete')])[2]")
    public WebElement RemoveSecondProductFromCart;
    @FindBy(xpath = "//b[contains(text(),'Cart is empty!')]")
    public WebElement VerifyCartEmpty;
    @FindBy(xpath = "//h2[contains(text(),'Category')]")
    public WebElement VerifyCategory;
    @FindBy(xpath = "(//i[contains(@class, 'plus')])[1]")
    public WebElement ClickOnWomensCategory;
    @FindBy(xpath = "(//a[contains(text(),'Dress')])[1]")
    public WebElement ClickOnWomensDress;
    @FindBy(xpath = "//h2[contains(text(),'Women - Dress Products')]")
    public WebElement VerifyWomenDressProductPage;
    @FindBy(xpath = "(//i[contains(@class, 'plus')])[2]")
    public WebElement ClickOnMensCategory;
    @FindBy(xpath = "//a[contains(text(),'Tshirts')]")
    public WebElement ClickOnMensTshirts;
    @FindBy(xpath = "//h2[contains(text(),'Men - Tshirts Products')]")
    public WebElement VerifyMenTShirtProductPage;
    @FindBy(xpath = "//h2[contains(text(),'Brands')]")
    public WebElement VerifyBrand;
    @FindBy(xpath = "(//a[contains(@href, 'brand_products')])[1]")
    public WebElement ClickOnFirstBrand;
    @FindBy(xpath = "//h2[contains(text(),'Brand -')]")
    public WebElement VerifyFirstBrandPage;
    @FindBy(xpath = "(//div[contains(@class, 'product-overlay')])[1]")
    public WebElement VerifyFirstBrandProduct;
    @FindBy(xpath = "(//a[contains(@href, 'brand_products')])[2]")
    public WebElement ClickOnSecondBrand;
    @FindBy(xpath = "//h2[contains(text(),'Brand -')]")
    public WebElement VerifySecondBrandPage;
    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement VerifyAllProductPage;
    @FindBy(xpath = "//input[contains(@name, 'search')]")
    public WebElement SearchProduct;
    @FindBy(xpath = "//button[contains(@type, 'button')]")
    public WebElement ClickOnSearch;
    @FindBy(xpath = "//h2[contains(text(),'Searched Products')]")
    public WebElement VerifySearch;
    @FindBy(xpath = "(//div[contains(@class, 'product-overlay')])[1]")
    public WebElement VerifyFirstSearchProduct;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[1]")
    public WebElement AddFirstSearchProduct;
    @FindBy(xpath = "(//a[contains(@class, 'add-to-cart')])[3]")
    public WebElement AddSecondSearchProduct;
    @FindBy(xpath = "//a[contains(text(),'Write Your Review')]")
    public WebElement VerifyWriteReview;
    @FindBy(xpath = "//input[contains(@id, 'name')]")
    public WebElement ReviewName;
    @FindBy(xpath = "(//input[contains(@id, 'email')])[1]")
    public WebElement ReviewEmail;
    @FindBy(xpath = "//textarea[contains(@id, 'review')]")
    public WebElement AddReview;
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement SubmitReview;
    @FindBy(xpath = "//span[contains(text(),'Thank you for your review.')]")
    public WebElement VerifySubmitReview;
    @FindBy(xpath = "//h2[contains(text(),'recommended items')]")
    public WebElement VerifyRecomendedProduct;
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[69]")
    public WebElement AddRecomendedProduct1ToCart;
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[72]")
    public WebElement AddRecomendedProduct2ToCart;
    @FindBy(xpath = "(//li[contains(@class, 'address_firstname')])[1]")
    public WebElement VerifyDeliveryAddressName;
    @FindBy(xpath = "(//li[contains(@class, 'address_firstname')])[2]")
    public WebElement VerifyBillingAddressName;
    @FindBy(xpath = "(//li[contains(@class, 'address_address1')])[1]")
    public WebElement VerifyDeliveryCompanyName;
    @FindBy(xpath = "(//li[contains(@class, 'address_firstname')])[4]")
    public WebElement VerifyBillingCompanyName;
    @FindBy(xpath = "(//li[contains(@class, 'address_city')])[1]")
    public WebElement VerifyDeliveryAddress;
    @FindBy(xpath = "(//li[contains(@class, 'address_city')])[2]")
    public WebElement VerifyBillingAddress;
    @FindBy(xpath = "//u[contains(text(),'Register / Login')]")
    public WebElement ClickOnRegLogIn;
    @FindBy(xpath = "//a[contains(text(),'Download Invoice')]")
    public WebElement ClickOnDownloadInvoice;
    @FindBy(xpath = "//i[contains(@class, 'fa fa-angle-up')]")
    public WebElement ClickOnRightSideUpArrow;
    @FindBy(xpath = "//h2[contains(text(),'Full-Fledged practice website for Automation Engineers')]")
    public WebElement VerifyFullFledgeText;
    @FindBy(xpath = "(//i[contains(@class, 'fa fa-angle-left')])[2]")
    public WebElement ClickOnLeftArrow;
    @FindBy(xpath = "//iframe[contains(@id, 'aswift_1')]")
    public WebElement SwitchToIframe1;
    @FindBy(xpath = "//iframe[contains(@id, 'ad_iframe')]")
    public WebElement SwitchToIframe2;

    @FindBy(xpath = "//div[contains(@class, 'close-button')]")
    public WebElement ClickOnCloseAdv;



    public void Login(String username, String password) {
        EmailAddress.sendKeys(username);
        LoginPassword.sendKeys(password);
        ClickLogin.click();
    }

    public void NewUserSignup(String Name, String Email) {
        name.sendKeys(Name);
        email.sendKeys(Email);
        SignupButton.click();
    }
}
