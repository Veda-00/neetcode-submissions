class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        st=[]
        maxarea=0
        for i in range(len(heights)+1):
            curr = 0 if i == len(heights) else heights[i]
            while st and curr<heights[st[-1]]:
                height=heights[st.pop()]
                left= -1 if not st else st[-1]
                width=i-left-1
                area=height*width
                maxarea=max(area,maxarea)
            if i<len(heights):st.append(i)
        return maxarea

