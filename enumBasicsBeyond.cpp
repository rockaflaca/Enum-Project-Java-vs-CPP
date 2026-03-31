#include <iostream>
using namespace std;
enum Level { // Enum structure
  LOW,
  MEDIUM,
  HIGH
};
int main() {
  enum Level myVar = HIGH; // Initalizes a new enum myVar with the Level struct
  myVar = static_cast<Level>(myVar + 1);
  cout << myVar << "\n"; // Will print out 3 even though that's beyond the Enum scope
  return 0;
}