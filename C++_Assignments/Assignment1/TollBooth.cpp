#include <iostream> 
using namespace std;

class TollBooth {
    int totalVehicles;
    double totalRevenue;


    public:
    void reset(){
        totalVehicles = 0;
        totalRevenue = 0.0;
    }
    void vehiclePayingToll(int vehicleType, double tollAmount){
        totalVehicles ++;

        switch (vehicleType)
        {
        case 1:
            totalRevenue +=tollAmount;
            cout <<"Standard Car Added. Toll collected: Rs" << tollAmount << endl;
            break;

        case 2:
            totalRevenue += tollAmount;
            cout <<"Truck added. Toll collected: Rs " << tollAmount << endl;
            break;
        
        case 3:
            totalRevenue += tollAmount;
            cout <<"Bus added. Toll collected: Rs " << tollAmount << endl;
            break;
            
            default:
            cout << "Invalid vehicle type\n";
            totalVehicles--;
        }
    }
    int getTotalVehicles(){
        return totalVehicles;
    }
    double getTotalRevenue(){
        return totalRevenue;
    }
};

int main(){
    TollBooth booth;
    int choice;

    const double StandardToll = 180.0;
    const double TruckToll = 300.0;
    const double BusToll = 350.0;

    do{
        cout << "\n----Toll Booth Menu----\n";
        cout <<"1. Add Standard Car(Rs 180)\n";
        cout <<"2. Add Truck(Rs 300)\n";
        cout <<"3. Add Bus(Rs 350)\n";
        cout <<"4. Display Total Vehicles Passed\n";
        cout <<"5. Display Total Revenue Collected\n";
        cout <<"6. Reset Booth Statistics\n";
        cout <<"7. Exit\n";
        cout <<"Enter your choice: ";
        cin >> choice;

        switch(choice){
        case 1:
            booth.vehiclePayingToll(1, StandardToll);
            break;

        case 2:
            booth.vehiclePayingToll(2, TruckToll);
            break;

        case 3:
            booth.vehiclePayingToll(3, BusToll);
            break;

        case 4:
            cout << "Total Vehicles Passed: "<<booth.getTotalVehicles()<<endl;
            break;

        case 5:
            cout << "Total Revenue Collected: "<<booth.getTotalRevenue()<<endl;
            break;

        case 6:
            booth.reset();
            break;

        case 7:
            cout << "Exiting program..\n";
            break;

        default:
            cout <<"Invalid choice! Please try again\n";        
    }
} while(choice !=7);

return 0;
}