class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_dict = {}

        for i in range(len(nums)):
            rem = target - nums[i]

            if my_dict.get(rem) is None:
                my_dict[nums[i]] = i
            else:
                return [my_dict.get(rem), i]

        return [-1, -1]             