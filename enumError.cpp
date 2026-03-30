#include <iostream>
using namespace std;
enum Error{
    SPACE,
    LEAK,
    FOUND
};
int main()
{
    string messages[3] = {"Not enough space", "Memory leak", "File not found"};
    enum Error error = SPACE;
    error = static_cast<Error>(error + 1);
    switch(error)
    {
        case 0:
            cout << messages[error] << "\n";
            break;
        case 1:
            cout << messages[error] << "\n";
            break;
        case 2:
            cout << messages[error] << "\n";
            break;
        default:
            cout << "Error\n";
            break;
    }
    return 0;
}