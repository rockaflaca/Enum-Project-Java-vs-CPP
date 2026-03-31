#include <iostream>
using namespace std;
enum Level { // Empty enum
};
int main() {
  enum Level myVar; // Initalizes a new enum myVar with the Level struct
  myVar;
  cout << myVar << "\n"; // Will print out 0
  return 0;
}