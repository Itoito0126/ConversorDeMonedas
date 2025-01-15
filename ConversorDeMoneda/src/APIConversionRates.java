import com.google.gson.annotations.SerializedName;

//Con este record le digo a la función ReadApi() que busque solo el conversion_rates
public record APIConversionRates(
        @SerializedName("conversion_rates") APIMonedas ConversionRates
) {
}
