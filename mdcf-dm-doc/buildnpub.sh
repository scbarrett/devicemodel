# Requirements:
# * sphinx: http://sphinx-doc.org
# * pygments: http://pygments.org
# * pygments-style-github: https://pypi.python.org/pypi/pygments-style-github
export PATH=$PATH:/opt/local/bin::/usr/texbin
cd src/main/resources
touch source/index.rst
make html
cp -R build/html/* ../../../../../mdcf.github.io/doc/dms/
cd ../../..
cp -R ../mdcf-dml-ast/doc/* ../../mdcf.github.io/doc/dml/
