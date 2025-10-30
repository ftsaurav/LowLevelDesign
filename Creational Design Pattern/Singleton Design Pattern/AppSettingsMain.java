class AppSettings{
    // make a private static variable of same class
    private static AppSettings instance;
    private String jdbcUrl;
    private String apiKey;

    // make the constructior as private so no one can make even a single object
    private AppSettings()
    {
        jdbcUrl= "abc";
        apiKey= "hfhhuhu45h3bi";
    }

    // make a public static AppSettings get instance to create the object if not created for the first time
    public static AppSettings getInstance()
    {
        if(instance==null)
        {
            instance= new AppSettings();
        }
        return instance;
    }

    public String getApiKey()
    {
        return apiKey;
    }
    public String getjdbcUrl()
    {
        return jdbcUrl;
    }
}
public class AppSettingsMain{
    public static void main(String[] args) {
        AppSettings appSettings1= AppSettings.getInstance();
        AppSettings appSettings2= AppSettings.getInstance();
        System.out.println(appSettings1.getApiKey());
        System.out.println(appSettings2.getApiKey());

        System.out.println(appSettings1==appSettings2);

       

    }
}