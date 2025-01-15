import com.google.gson.annotations.SerializedName;

//Estas son las monedas que decidí utilizar para el conversor
//Con este record elijo que monedas se extraen del conversion_rates
public record APIMonedas(
        @SerializedName("USD") double USD,
        @SerializedName("ARS") double ARS,
        @SerializedName("BOB") double BOB,
        @SerializedName("BRL") double BRL,
        @SerializedName("CLP") double CLP,
        @SerializedName("COP") double COP
){}
