defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator


  @doc """
  ***************************************************
      Testing the output of percentage_grade method
  ***************************************************
  """
  describe "percentage_grade/1" do

    test "TC1" do
      assert 37 ==
               Calculator.percentage_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.7,
                 final: 0.75
               })
    end

    test "TC2" do
      assert 68 ==
               Calculator.percentage_grade(%{
                 homework: [0.5],
                 labs: [0.8],
                 midterm: 0.70,
                 final: 0.75
               })
    end
  end


  @doc """
  *****************************************
      Testing The letter_grade method
  *****************************************
  """
  describe "letter_grade/2" do

    test "TC1" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.8,
                 final: 0.7
               })
    end

    test "TC2" do
      assert "A+" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 1,
                 final: 0.655
               })
    end

    test "TC3" do
      assert "A" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 0.83,
                 final: 0.76
               })
    end

    test "TC4" do
      assert "A-" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC5" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [0.9],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC6" do
      assert "B" ==
               Calculator.letter_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC7" do
      assert "C+" ==
               Calculator.letter_grade(%{
                 homework: [0.65],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC8" do
      assert "C" ==
               Calculator.letter_grade(%{
                 homework: [0.65],
                 labs: [0.75, 0.75, 0.75],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC9" do
      assert "D+" ==
               Calculator.letter_grade(%{
                 homework: [0.65],
                 labs: [0.5, 0.5, 0.5],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC10" do
      assert "D" ==
               Calculator.letter_grade(%{
                 homework: [0.45],
                 labs: [0.5, 0.5, 0.5],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC11" do
      assert "E" ==
               Calculator.letter_grade(%{
                 homework: [0.45],
                 labs: [0.25, 0.25, 0.25],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC12" do
      assert "F" ==
               Calculator.letter_grade(%{
                 homework: [0.45],
                 labs: [0.25, 0.25, 0.25],
                 midterm: 0.4,
                 final: 0.4
               })
    end
  end

  @doc """
  ******************************************
      Testing The numeric_grade method
  ******************************************
  """
  describe "numeric_grade/3" do

    test "TC1" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.8,
                 final: 0.7
               })
    end

    test "TC2" do
      assert 10 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 1,
                 final: 0.655
               })
    end

    test "TC3" do
      assert 9 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 0.83,
                 final: 0.76
               })
    end

    test "TC4" do
      assert 8 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC5" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [0.9],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC6" do
      assert 6 ==
               Calculator.numeric_grade(%{
                 homework: [0.8],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC7" do
      assert 5 ==
               Calculator.numeric_grade(%{
                 homework: [0.65],
                 labs: [1, 1, 1],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC8" do
      assert 4 ==
               Calculator.numeric_grade(%{
                 homework: [0.65],
                 labs: [0.75, 0.75, 0.75],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC9" do
      assert 3 ==
               Calculator.numeric_grade(%{
                 homework: [0.65],
                 labs: [0.5, 0.5, 0.5],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC10" do
      assert 2 ==
               Calculator.numeric_grade(%{
                 homework: [0.45],
                 labs: [0.5, 0.5, 0.5],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC11" do
      assert 1 ==
               Calculator.numeric_grade(%{
                 homework: [0.45],
                 labs: [0.25, 0.25, 0.25],
                 midterm: 0.7375,
                 final: 0.5
               })
    end

    test "TC12" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [0.45],
                 labs: [0.25, 0.25, 0.25],
                 midterm: 0.4,
                 final: 0.4
               })
    end
  end
end