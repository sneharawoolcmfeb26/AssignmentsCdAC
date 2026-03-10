#include <stdio.h>

int main() {
    float sub1, sub2, sub3, sub4, sub5;

    printf("Enter marks for 5 subjects: ");
    scanf("%f %f %f %f %f", &sub1, &sub2, &sub3, &sub4, &sub5);

    float total = sub1 + sub2 + sub3 + sub4 + sub5;
    float percentage = total / 5;

    printf("\nSubject Marks:\n");
    printf("Subject 1: %.2f\n", sub1);
    printf("Subject 2: %.2f\n", sub2);
    printf("Subject 3: %.2f\n", sub3);
    printf("Subject 4: %.2f\n", sub4);
    printf("Subject 5: %.2f\n", sub5);

    printf("\nTotal Marks: %.2f\n", total);
    printf("Percentage: %.2f%%\n", percentage);

    printf("Grade is : %s\n",
        (percentage >= 75) ? "A" :
        (percentage >= 60) ? "B" :
        (percentage >= 45) ? "C" : "Fail");
        
        return 0;

}
