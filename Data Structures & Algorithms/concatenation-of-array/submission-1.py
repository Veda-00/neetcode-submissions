class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        lt=[]
        for i in range(2):
            for num in nums:
                lt.append(num)
        return lt
            
        