#include <iostream>
using namespace std;
enum Level {
  LOW = 1,
  MEDIUM,
  HIGH
};
int main() {
    enum Level floor = MEDIUM;
    switch(floor){
        case 1:
            cout << "Low level\n";
            break;
        case 2:
            cout << "Medium level\n";
            break;
        case 3: 
            cout << "High level\n";
            break;
        default:
            cout << "Error\n";
    }
  return 0;
}