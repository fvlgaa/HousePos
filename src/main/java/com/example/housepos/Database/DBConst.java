package com.example.housepos.Database;

public class DBConst {



    public static final String DB_NAME ="talabimd";
    public static final String DB_USER ="talabi";
    public static final String DB_PASS ="6annn6annn";

    // Table Names
    public static final String PROPERTY_TABLE = "properties";
    public static final String TENANT_TABLE = "tenants";
    public static final String PAYMENT_TABLE = "payments";
    public static final String LEASE_TABLE = "leases";

    // Property Table Column Names
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_LOCATION = "location";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_MONTHLY_RENT = "monthly_rent";
    public static final String PROPERTY_AVAILABILITY = "availability";

    // Tenant Table Column Names
    public static final String TENANT_ID = "id";
    public static final String TENANT_NAME = "name";
    public static final String TENANT_CONTACT_INFO = "contact_info";
    public static final String TENANT_EMAIL = "email";
    public static final String TENANT_LOYALTY_POINTS = "loyalty_points";

    // Payment Table Column Names
    public static final String PAYMENT_ID = "id";
    public static final String PAYMENT_TENANT_ID = "tenant_id";
    public static final String PAYMENT_AMOUNT = "amount";
    public static final String PAYMENT_DATE = "payment_date";
    public static final String PAYMENT_STATUS = "status";

    // Lease Table Column Names
    public static final String LEASE_ID = "id";
    public static final String LEASE_PROPERTY_ID = "property_id";
    public static final String LEASE_TENANT_ID = "tenant_id";
    public static final String LEASE_START_DATE = "start_date";
    public static final String LEASE_END_DATE = "end_date";
    public static final String LEASE_STATUS = "status";
    public static final String SUBMIT_BUTTON_TEXT = "submit";
    public static final String ADD_PROPERTY_TITLE = "property_title";


    private DBConst() {
        // Prevent instantiation
    }
}
