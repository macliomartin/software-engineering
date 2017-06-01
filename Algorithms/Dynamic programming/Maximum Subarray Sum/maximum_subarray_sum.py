# implementation of kadane's algorithm - ref : https://en.wikipedia.org/wiki/Maximum_subarray_problem

def maximum_subarray_sum(arr):
	max_so_far = max_ending_here = arr[0]
	start = end = new_start = 0

	for (i, x) in enumerate(arr[1:], start=1):
		if max_ending_here <= 0:
			new_start, max_ending_here = i, x
		else:
			max_ending_here += x
		if max_so_far < max_ending_here:
			start, end, max_so_far = new_start, i, max_ending_here

	print("The subarray has indices in range [%s, %s] and has a sum %s" % (start, end, max_so_far))
	
	
data = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
maximum_subarray_sum(data)
