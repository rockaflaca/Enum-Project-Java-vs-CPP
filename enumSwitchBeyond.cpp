#include <iostream>
using namespace std;
enum Level {
  LOW = 1,
  MEDIUM,
  HIGH,
  HIGHEST // new added enum value
};
int main() {
    enum Level floor = MEDIUM;
    switch(floor){ // Could also use the numbers associated with the name as the cases
        case LOW:
            cout << "Low level " << floor << "\n";
            break;
        case MEDIUM:
            cout << "Medium level " << floor << "\n";
            break;
        case HIGH: 
            cout << "High level " << floor << "\n";
            break;
        default:
            cout << "Error\n";
    }
  return 0; // No compilation error
}