class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        my_map = {}

        for word in strs:
            sorted_word = ''.join(sorted(word))

            if my_map.get(sorted_word) is not None:
                my_map[sorted_word].append(word)

            else:
                my_map[sorted_word] = []
                my_map[sorted_word].append(word)

        return list(my_map.values())