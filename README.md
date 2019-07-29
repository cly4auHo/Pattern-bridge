# Pattern-bridge

Problems can the Bridge design pattern solve:

-An abstraction and its implementation should be defined and extended independently from each other.
-A compile-time binding between an abstraction and its implementation should be avoided 
so that an implementation can be selected at run-time.

When using subclassing, different subclasses implement an abstract class in different ways. 
But an implementation is bound to the abstraction at compile-time and can't be changed at run-time.

Solution:

-Separate an abstraction (Abstraction) from its implementation (Implementor) by putting them in separate class hierarchies.
-Implement the Abstraction in terms of (by delegating to) an Implementor object.

Шаблон мост (англ. Bridge) — структурный шаблон проектирования, 
используемый в проектировании программного обеспечения чтобы «разделять абстракцию и реализацию так, 
чтобы они могли изменяться независимо».
Шаблон мост использует инкапсуляцию, агрегирование и может использовать наследование для того, 
чтобы разделить ответственность между классами.
