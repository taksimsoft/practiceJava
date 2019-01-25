package Lookup;

public enum CountryCodes {

    AFGANISTAN ("Afghanistan", "AF", "AFG", "004"),
    ALAND_ISLANDS ("Aland Islands",	"AX",	"ALA",	"248"),
    Albania ("Albania",	"AL",	"ALB",	"008"),
    Algeria ("Algeria",	"DZ",	"DZA",	"012"),
    AmericanSamoa ("American Samoa",	"AS",	"ASM",	"016"),
    Andorra ("Andorra",	"AD",	"AND",	"020"),
    Angola  ("Angola ", "AO",	"AGO",	"024");

    CountryCodes(String cName, String cCode2Ch, String cCode3Ch, String cCodeNm) {
        this.countryName = cName;
        this.countryCode2Char = cCode2Ch;
        this.countryCode3Char = cCode3Ch;
        this.countryCodeNumber = cCodeNm;
    }

    private String  countryName;
    private String  countryCode2Char;
    private String  countryCode3Char;
    private String  countryCodeNumber;

}
