# Copyright (c) 2014, 2015 Oracle and/or its affiliates. All rights reserved. This
# code is released under a tri EPL/GPL/LGPL license. You can use it,
# redistribute it and/or modify it under the terms of the:
# 
# Eclipse Public License version 1.0
# GNU General Public License version 2
# GNU Lesser General Public License version 2.1

# These are implemented just to get other stuff working - we'll go back and
# implement these properly later.

class Numeric

  def eql?(other)
    self == other
  end

end

class Complex
end

module Kernel

  def Complex(real, imaginary)
    imaginary
  end

end

class Channel
end

ARGF = Object.new

class Hash

  def fetch(key, default=nil)
    if key?(key)
      self[key]
    elsif block_given?
      yield(key)
    elsif default
      default
    else
      raise(KeyError, "key not found: #{key}")
    end
  end

  def each_key
    each do |key, value|
      yield key
    end
  end

end
