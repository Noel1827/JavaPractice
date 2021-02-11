#include <iostream>
#include <vector>
#include <set>

using namespace std;
vector<vector<int>> threeSum(vector<int> &nums)
{
    int sum = 0, Vcount = 0;
    vector<vector<int>> ArrVec;
     for (int i = 0; i < nums.size(); i++)
    {
        for (int j = i; j < nums.size() - 1; j++)
        {
            for (int k = j; k < nums.size() - 2; k++)
            {
                sum += nums[i] + nums[j + 1] + nums[k + 2];
                if (sum == 0)
                {
                    ArrVec[Vcount].push_back(nums[i]);
                    ArrVec[Vcount].push_back(nums[j+1]);
                    ArrVec[Vcount].push_back(nums[k+2]);
                    Vcount++;
                }
            }
        }
    }

}
int main()
{

    return 0;
}