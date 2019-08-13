#Target
1. 把命令行字符串拆分成main函数可用的字符串数组
1. 把字符串形式的Schema解析成对象
1. 根据Schema和参数字符串数组获取参数值


#Step
1. schema 支持传入指定Class和默认值
1. schema 支持不同类型的定义，支持Boolean
1. schema 支持不同类型的定义，支持Int
1. schema 支持不同类型的定义，支持String
1. schema 提供一个getValue方法，在没有给定值时返回默认值
1. 提供ValueParser解析器，将 true，返回传入的true
1. schema 向getValue传入 11，返回传入的11
1. schema 向getValue传入 "OK"，返回传入的"OK"
1. 
