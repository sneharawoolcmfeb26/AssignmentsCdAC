#include <stdio.h>

float celsiusToFahrenheit(float c)
{
    return(c * 9 / 5) + 32;
}
float FahrenheitToCelsius(float f)
{
    return(f - 32) * 5 / 9;
}

int main(){
    float c = 12.5;
    float f = 65.8;
    
    printf("Celsius to Fahrenheit: %.2f\n",celsiusToFahrenheit(c));
    printf("Fahrenheit to Celsius: %.2f\n",FahrenheitToCelsius(f));

    return 0;
}
