function solution(phone_number) {
    return '*'.repeat(phone_number.length-4) + phone_number.substring(phone_number.length - 4)
}