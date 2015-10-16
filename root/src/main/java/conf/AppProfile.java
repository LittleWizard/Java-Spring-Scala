package conf;


public enum AppProfile {
    developer, build, dev, stage, prod;

    private static AppProfile activeProfile = null;

    public boolean isProduction() {
        return this == stage || this == prod;
    }

    public boolean isDevelopment() {
        return !isProduction();
    }

    public static AppProfile getActive() {
        if (activeProfile == null) {
            activeProfile = detectAppProfile();
            System.setProperty("appProfile", activeProfile.name());
        }
        return activeProfile;
    }


    private static AppProfile detectAppProfile() {

        String profile = System.getenv("appProfile");
        if (org.apache.commons.lang3.StringUtils.isBlank(profile)) {
            profile = System.getProperty("appProfile", getDefault().name());
        }
        return valueOf(profile);
    }

    public static AppProfile getDefault() {
        return developer;
    }

}
