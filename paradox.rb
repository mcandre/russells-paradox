#!/usr/bin/env ruby

require "pp"

a = []
a.push a
puts "A: ",  a
puts "A[0]: ", a[0]
puts "A[0][0]: ", a[0][0]
puts "A = ", pp(a)
puts "#A: ", a.length
