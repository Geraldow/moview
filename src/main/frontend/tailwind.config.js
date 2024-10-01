/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["../resources/templates/**/*.{html,js}"],
  theme: {
    extend: {
      colors: {
          primaryColor: '#FEF3F2',
          secondaryColor: '#314852',
        },
    },
  },
  plugins: [] ,
}

