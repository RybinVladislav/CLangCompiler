.assembly program
{
}

.class public Program
{
   .field private static int32[] a
   .method private hidebysig specialname rtspecialname static  void  .cctor() cil managed
   {
      ldc.i4.s 10
      newarr [mscorlib] System.Int32
      stsfld int32[] Program::a
      ldsfld int32[] Program::a
      ldc.i4.s 0
      ldc.i4.s 1
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 1
      ldc.i4.s 2
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 2
      ldc.i4.s 3
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 3
      ldc.i4.s 4
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 4
      ldc.i4.s 5
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 5
      ldc.i4.s 6
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 6
      ldc.i4.s 7
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 7
      ldc.i4.s 8
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 8
      ldc.i4.s 9
      stelem.i4
      ldsfld int32[] Program::a
      ldc.i4.s 9
      ldc.i4.s 10
      stelem.i4
      ret
   }
   .method private hidebysig static int32 search(int32 x) cil managed
   {
      .locals(
         [0] int32 ok,
         [1] int32 i
      )
      ldc.i4.s 0
      stloc.s 0
      ldc.i4.s 0
      stloc.s 1
      br.s L_0001
    L_0000:
      ldarg.s 0
      ldsfld int32[] Program::a
      ldloc.s 1
      ldelem.i4
      ceq
      brfalse.s L_0002
      ldc.i4.s 1
      stloc.s 0
      br.s L_0003
    L_0002:
      ldloc.s 1
      ldc.i4.s 1
      add
      stloc.s 1
    L_0003:
    L_0001:
      ldloc.s 1
      ldc.i4.s 9
      clt
      ldloc.s 0
      ldc.i4.s 1
      ceq
      ldc.i4.0
      ceq
      and
      brtrue.s L_0000
      ldloc.s 0
      ldc.i4.s 1
      ceq
      brfalse.s L_0004
      ldloc.s 1
      br.s RL_0000
      br.s L_0005
    L_0004:
      ldc.i4.s -1
      br.s RL_0000
    L_0005:
    RL_0000:
      ret
   }
   .method private hidebysig static void main() cil managed
   {
      .entrypoint
      .locals(
         [0] int32 k,
         [1] int32 pos
      )
      call string [mscorlib]System.Console::ReadLine()
      call int32 [mscorlib]System.Int32::Parse(string)
      stloc.s 0
      ldloc.s 0
      call int32 Program::search(int32)
      stloc.s 1
      ldloc.s 1
      ldc.i4.s -1
      cgt
      brfalse.s L_0006
      ldloc.s 1
      call void [mscorlib]System.Console::WriteLine(int32)
      br.s L_0007
    L_0006:
      ldstr "Not found"
      call void [mscorlib]System.Console::WriteLine(string)
    L_0007:
    RL_0001:
      ret
   }
}
