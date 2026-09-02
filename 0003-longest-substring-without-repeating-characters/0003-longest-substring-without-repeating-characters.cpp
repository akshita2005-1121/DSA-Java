class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int high;
        int ans=INT_MIN;
        int len;
        unordered_map<char,int>f;
        int low=0;
        for(high=0;high<s.size();high++){
            f[s[high]]++;
            len=high-low+1;
            while(len!=f.size()){
                f[s[low]]--;
                low++;
                if(f[s[low-1]]==0){
                    f.erase(s[low-1]);
                }
                len=high-low+1;
            }
          if(len==f.size()){
            ans=max(len,ans);
          }
        }
        if(ans==INT_MIN){
            return 0;
        }
        return ans;
    }
};