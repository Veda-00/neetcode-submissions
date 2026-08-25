class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res=[0]*len(temperatures)
        st=[]
        for i in range(len(temperatures)):
            while len(st)!=0 and temperatures[i]>temperatures[st[-1]]:
                previndx=st.pop()
                res[previndx]=i-previndx
            st.append(i)
        return res