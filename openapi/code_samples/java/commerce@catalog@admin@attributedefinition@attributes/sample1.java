AppAuthInfo appAuthInfo = new AppAuthInfo();
        
/** replace with your authentication configuration */
appAuthInfo.setApplicationId("yourApplicationKey");
appAuthInfo.setSharedSecret("yourSharedSecret");

AppAuthenticator.initialize(appAuthInfo);

/** replace with your tenant ID and site ID */
MozuApiContext apiContext = new MozuApiContext(yourTenantID, yourSiteID);

/** create a customer account resource */					
CustomerAccountResource customerAccountResource = new CustomerAccountResource(apiContext);

/** log the total number of customer accounts */
try {
    System.out.println("Number of Customer Accounts: " + customerAccountResource.getAccounts().getTotalCount());
} catch (Exception e) {
    e.printStackTrace();
}
