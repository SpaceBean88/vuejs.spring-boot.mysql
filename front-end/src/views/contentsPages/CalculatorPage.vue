<template>
<section>
<div class="container">
    <div class="row">
      <div class="col-lg-4 col-md-4 calcRec-wrap">
        계산기록영역
      </div>
      <div class="col-lg-8 col-md-8 calc-wrap">
        <div class="calc">
          <table>
            <tr class="displayWrap">
              <td colspan="4">
                <p class="dp">
                  <input type="text" class="calcDisplay" v-model="calculateRec" disabled>
                </p>
                <p class="dp">
                  <input type="text" class="numDisplay" v-model="result" disabled>
                </p>
              </td>
            </tr>
            <tr>
              <td class="button opr" @click="clear()">C</td>
              <td class="button opr" @click="invert()">+/-</td>
              <td class="button opr" @click="percent()">%</td>
              <td class="button opr" @click="setOperator('÷')">÷</td>
            </tr>
            <tr>
              <td class="button numb" @click="addNumber('7')">7</td>
              <td class="button numb" @click="addNumber('8')">8</td>
              <td class="button numb" @click="addNumber('9')">9</td>
              <td class="button opr" @click="setOperator('x')">×</td>
            </tr>
            <tr>
              <td class="button numb" @click="addNumber('4')">4</td>
              <td class="button numb" @click="addNumber('5')">5</td>
              <td class="button numb" @click="addNumber('6')">6</td>
              <td class="button opr" @click="setOperator('-')">-</td>
            </tr>
            <tr>
              <td class="button numb" @click="addNumber('1')">1</td>
              <td class="button numb" @click="addNumber('2')">2</td>
              <td class="button numb" @click="addNumber('3')">3</td>
              <td class="button opr" @click="setOperator('+')">+</td>
            </tr>
            <tr>
              <td class="button numb" @click="addNumber('0')" colspan="2">0</td>
              <td class="button opr" @click="addDot()">.</td>
              <td class="button opr" @click="equal()">=</td>
            </tr>
          </table>
        </div>
      </div>
    </div>
  </div>
</section>
</template>

<script>
export default {
  data () {
    return {
      result: 0,
      tmp_value: 0,
      reset: false,
      operator: undefined,
      calculateRec: ''
    }
  },
  methods: {
    clear () {
      this.result = 0
      this.tmp_value = 0
      this.reset = false
      this.operator = undefined
      this.calculateRec = ''
    },
    invert () {
      this.result *= -1
    },
    percent () {
      this.result /= 100
    },
    addDot () {
      if (!this.result.toString().includes('.')) {
        this.result += '.'
      }
    },
    addNumber (number) {
      if (this.result.toString() === '0' || this.reset === true) {
        this.result = ''
        this.reset = false
      }
      if (this.calculateRec === '0') {
        this.calculateRec = ''
      }
      if (this.calculateRec.includes(`=${this.result}`)) {
        this.calculateRec = ''
        this.result = ''
      }
      this.result += number.toString()
      this.calculateRec += number.toString()
    },
    setOperator (operator) {
      if (this.tmp_value !== 0) {
        this.calculator()
      }
      this.tmp_value = this.result
      this.operator = operator
      this.reset = true
      if (!this.calculateRec.includes('=')) {
        this.calculateRec += this.operator
      }
    },
    equal () {
      this.calculator()
      this.tmp_value = 0
      this.operator = undefined
      if (!this.calculateRec.includes(`=${this.result}`)) {
        this.calculateRec += `=${this.result}`
      }
    },
    calculator () {
      let value = 0
      const firstNum = parseFloat(this.tmp_value)
      const secondNum = parseFloat(this.result)

      switch (this.operator) {
        case '+':
          value = firstNum + secondNum
          break
        case '-':
          value = firstNum - secondNum
          break
        case 'x':
          value = firstNum * secondNum
          break
        case '÷':
          value = firstNum / secondNum
          break
        default:
          value = secondNum
      }

      this.result = value
    }
  }
}
</script>

<style type="scss" scoped>
  section {
    margin-top: 40px;
  }

  .calc-wrap{
    padding: 20px;
    /* border: 1px solid; */
  }

  .calcRec-wrap{
    height: 600px;
    background-color: #dddddd;
    box-shadow: 0px 3px 10px 0px #dddddd;
  }

  .calc {
    margin: 0 auto;
    /* border: 1px solid #777; */
    box-shadow: 0px 3px 10px 0px #ffa1a1;
    padding: 10px;
    height: 550px;
    width: 400px;
    background-color: #ffa1a1;

  }

  table {
    margin: 0 auto;
    width: 100%;
    height: 530px;
    background-color: #ffa1a1;
  }

  tr {
    padding: 5px;
    text-align: center;
  }

  .displayWrap {
    height: 110px;
  }

  .dp {
    margin: 0;
    padding: 0px 10px;
    height: 40%;
    text-align: right;
    background-color: #857979;
    color: #ffffff;
  }

  .numDisplay {
    width: 100%;
    height: 100%;
    border: 0;
    text-align: right;
    padding: 5px;
    font-size: 45px;
    font-weight: 700;
    color: #ffffff;
    background-color: #857979;
  }

  .calcDisplay {
    width: 100%;
    height: 100%;
    border: 0;
    text-align: right;
    color: #ffffff;
    background-color: #857979;
  }

  .button {
    margin: 5px;
    padding: 0px;
    width: 25%;
    height: 70px;
    font-size: 30px;
    font-weight: 700;
    color: #ffffff;
    border-radius: 100px;
    cursor: pointer;
  }

.numb:hover {
    background-color: bisque;
    color: #222;
  }

.opr:hover {
  background-color: #ff5f7a;
}

  @media (max-width: 767px) {
    .calcRec-wrap {
      display: none;
    }
  }
</style>
